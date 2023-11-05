package Phone;

public class MyPhone {
        private String number, model;
        private double  weight;

        public MyPhone(String number, String model, double weight) {
                this.number = number;
                this.model = model;
                this.weight = weight;
        }

        public MyPhone(String number, String model) {
                this.number = number;
                this.model = model;
        }

        public MyPhone() {
        }
        public void setNumber(String number){
                this.number = number;
        }

        public String getNumber() {
                return number;
        }

        public String getModel() {
                return model;
        }

        public void setModel(String model) {
                this.model = model;
        }

        public double getWeight() {
                return weight;
        }

        public void setWeight(double weight) {
                this.weight = weight;
        }

        void receiveCall(String name){
                System.out.println("Calling: " + name);
        }
        void receiveCall(String name, String number){
                System.out.println("Calling: " + name + ". Number: " + number);
                System.out.println("My number: " + this.number);
        }


}
