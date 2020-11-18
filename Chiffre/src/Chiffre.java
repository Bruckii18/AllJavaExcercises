public class Chiffre {

        public static void main(String[] args) {
            String text = "Ich bin ein Passwort";
            int offset = 2;

            System.out.println(encryptString(text, offset)); //decrypted den encrypteten String text mit jeweils dem gleichen Offset
            System.out.println(decrypt(encryptString(text, offset), offset));
        }

        public static String decrypt(String text, int offset)
        {
            String ret = "";
            for(int i = 0; i < text.length(); i++)
            {
                char c = text.charAt(i);
                if ((int)c+offset < 97)
                {
                    ret += (char)((int) c - offset + 26);
                }
                else
                {
                    ret += (char)((int)c-offset);
                }
            }
            return ret;
        }

        public static String encryptString(String text,int offset)
        {
            String ret = "";
            for(int i = 0; i < text.length(); i++)
            {
                ret += encrypt(text.charAt(i), offset);
            }
            return ret;
        }

        public static char encrypt(char c,int offset)
        {
            if ((int)c+offset > 122)
            {
                return (char) ((int) c + offset - 26);
            }
            else
            {
                return (char)((int)c+offset);
            }
        }
}