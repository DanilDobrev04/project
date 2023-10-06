public class Tariff{
        private String nameOfCourse;
        private float price;
        public Tariff(String nameOfCourse,float price){
            this.nameOfCourse = nameOfCourse;
            this.price = price;}

    public String getNameOfCourse() {
        return nameOfCourse;
    }

    public void setNameOfCourse(String nameOfCourse) {
        this.nameOfCourse = nameOfCourse;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}



