public class FreshJuice {
    enum FreshJuiceSize{Small,Medium,Large};
    FreshJuiceSize size;
}

class FreshJuiceTest{
    public static void main(String[] args) {
        FreshJuice juice = new FreshJuice();
        juice.size = FreshJuice.FreshJuiceSize.Large;
        System.out.println("The Juice Size is :" + juice.size);
    }
}


