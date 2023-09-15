public class Exam2 {


        public static void main(String[] args) {

                // 높이 : 3

                /*

                 *

                 ***

                 *****

                 */

                // 높이 : 5

                // 출력

                /*

                 *

                 ***

                 *****

                 *******

                 *********

                 */

                // 높이 : 7

                // 출력

                /*

                 *

                 ***

                 *****

                 *******

                 *********

                 ***********

                 *************

                 */
                ster(3);
                ster(5);
                ster(7);

        }

        static void ster(int line_num) {

                int pov = 0;

                for (int i = 1; i <= line_num; i++) {
                        for (int k = 1; k <= line_num * 2; k++) {
                                pov = line_num - i;
                                if (pov < k && k < (line_num * 2) - pov) {
                                        System.out.print("*");
                                }
                                else {
                                        System.out.print(" ");
                                }

                        }
                        System.out.println("");
                }

        }


}



