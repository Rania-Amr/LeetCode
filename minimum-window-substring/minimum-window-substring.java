class Solution {

    public String minWindow(String s, String t) {
        if (t == "") {
			return "";
		}
		// Creating the two hash maps
		HashMap<Character, Integer> window = new HashMap<>();
		HashMap<Character, Integer> rCount = new HashMap<>();
		// Populating rCount hashmap
		for (int c = 0; c < t.length(); c++) {
			char c1 = t.charAt(c);
			rCount.put(c1, rCount.getOrDefault(c1, 0) + 1);
		}
		int startIndex = 0;
		int current = 0;
		int required = rCount.size();

		int resLen = Integer.MAX_VALUE;

		int start = 0;

		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (rCount.containsKey(c)) {
				window.put(c, window.getOrDefault(c, 0) + 1);
				if (window.get(c).equals(rCount.get(c))) {
					current++;
				}
			}
			// Adjusting the sliding window
			while (current == required) {
				// update our result
				if (i - start < resLen) {
					startIndex = start;
					resLen = i - startIndex;
				}

				char d = s.charAt(start);
				start++;

				if (rCount.containsKey(d)) {
					if (window.get(d).equals(rCount.get(d))) {
						current--;
					}
					window.put(d, window.get(d) - 1);
				}
			}
		}
		return resLen == Integer.MAX_VALUE ? "" : s.substring(startIndex, startIndex+ resLen+1);
        
        
        
    }
}