public class PracticeProblem {

	public static void main(String args[]) {

	}
    public static void selectionSortName(String[] names, int[] ages) {
        for (int i = 0; i < names.length - 1; i++) {
            int SHABANGmin = i;

            for (int j = i + 1; j < names.length; j++) {
                if (names[j].compareToIgnoreCase(names[SHABANGmin]) < 0) {
                    SHABANGmin = j;
                }
            }


            String tempName = names[SHABANGmin];
            names[SHABANGmin] = names[i];
            names[i] = tempName;

            int tempAge = ages[SHABANGmin];
            ages[SHABANGmin] = ages[i];
            ages[i] = tempAge;
        }
    }

    public static void selectionSortAge(String[] names, int[] ages) {
        for (int i = 0; i < ages.length - 1; i++) {
            int SHABANGmin = i;
            

            for (int j = i + 1; j < ages.length; j++) {
                if (ages[j] < ages[SHABANGmin]) {
                    SHABANGmin = j;
                }
            }

            int tempAge = ages[SHABANGmin];
            ages[SHABANGmin] = ages[i];
            ages[i] = tempAge;


            String tempName = names[SHABANGmin];
            names[SHABANGmin] = names[i];
            names[i] = tempName;
        }
    }
	

}
