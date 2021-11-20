public class Task1 {
    public static void main(String[] args) {
        int count = 0;
        for (int hours = 0; hours < 24; hours++) {
            for (int minutes = 0; minutes < 60; minutes++) {
                String time2 = String.format("%02d", hours);
                String time3 = String.format("%02d", minutes);
                String time4 = new StringBuilder(time3).reverse().toString();
                if (time2.equals(time4)) {
                    count++;
                    System.out.println(time2 + ":" + time3);
                }
            }
        }
        System.out.println("Количество симметричных комбинаций раз за сутки: " + count);
    }
}
