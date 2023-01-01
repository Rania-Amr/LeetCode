/**
 * The read4 API is defined in the parent class Reader4.
 *     int read4(char[] buf4); 
 */

public class Solution extends Reader4 {
    char [] buffer = new char[4];
    int readPosition = 0;
    int writePosition = 0;
    /**
     * @param buf Destination buffer
     * @param n   Number of characters to read
     * @return    The number of actual characters read
     */
    public int read(char[] buf, int n) {
        for (int  i = 0; i < n; i++){
            if (writePosition == readPosition){
                writePosition = read4(buffer);
                readPosition = 0;
                if(writePosition == 0){
                    return i;
                }
            }
            buf[i] = buffer[readPosition++];
        }
        return n;
    }
}