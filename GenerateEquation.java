class GenerateEquation {
    public static void main(String[] args) {
        System.out.println(generateEquation(1,10));
        System.out.println(generateEquation(1,100));
    }

    private static String generateEquation(int low, int high){
        int sum = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = low; i < high; i++){
            if( i % 3 == 0 || i % 5 == 0){
                sum+=i;
                sb.append(i).append("+");
            }
        }
        return sb.append("=").append(sum).toString();
    }

}