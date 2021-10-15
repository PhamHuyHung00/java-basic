      public class app {
        public static void main(String[] args) {
            System.out.println("Hi, Huy Hung !");
            System.out.println( "Chỉ số bmi của Pham Huy Hung là: " +tinhBmi());
            System.out.println("Chỉ số bmi của tôi là : " + bmi(1.80, 65.5));
            chiSoBmi();
            person information = new person();
            information.name = " Phạm Huy Hùng";
            information.age = 21;
            information.address = "Hà Nội";
            information.number = 12;
            information.display();


        }

        public static double tinhBmi() {
            double height = 1.80;
            double weight = 65.5;
            double mbi = weight / (height * 2);
            return mbi;
        }

        public static double bmi(double height, double weight) {
            double tinhBmi = weight / (height + height);
            return tinhBmi;

        }

        public static void chiSoBmi() {
            double weight = 65.5;
            double height = 1.80;
            double mbi = weight / (height * 2);
            System.out.println("Đây là chỉ số:  " + mbi);

        }


    }


