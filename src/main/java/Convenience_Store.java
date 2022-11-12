import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Convenience_Store {

    public static void listSort(List<Integer>listID, List<String> brandName, List<String> brandType, List<Integer>brandPrice){
        for(int i = 0;i < listID.size(); i++){

            int keylist = listID.get(i);
            String keyname = brandName.get(i);//sort ID with Insertion sort
            String keytype = brandType.get(i);
            int keyprice = brandPrice.get(i);

            int k=i-1;

            while(k >= 0 && listID.get(k) > keylist){

                listID.set(k+1,listID.get(k));
                brandName.set(k+1,brandName.get(k));
                brandType.set(k+1,brandType.get(k));
                brandPrice.set(k+1,brandPrice.get(k));

                k = k-1;

            }

            listID.set(k+1,keylist);
            brandName.set(k+1, keyname);
            brandType.set(k+1, keytype);
            brandPrice.set(k+1, keyprice);

        }
    }

    public static void sort(List<Integer>listID, List<String> brandName, List<String> brandType, List<Integer>brandPrice){
        for(int i = 0;i < brandName.size(); i++){

            int keylist = listID.get(i);
            String keyname = brandName.get(i);//sort ID with Insertion sort
            String keytype = brandType.get(i);
            int keyprice = brandPrice.get(i);

            int k=i-1;

            while(k >= 0 && brandName.get(k).compareTo(keyname) > 0){

                listID.set(k+1,listID.get(k));
                brandName.set(k+1,brandName.get(k));
                brandType.set(k+1,brandType.get(k));
                brandPrice.set(k+1,brandPrice.get(k));

                k = k-1;

            }

            listID.set(k+1,keylist);
            brandName.set(k+1, keyname);
            brandType.set(k+1, keytype);
            brandPrice.set(k+1, keyprice);
        }
    }

    public static void typeSort(List<Integer>listID, List<String> brandName, List<String> brandType, List<Integer>brandPrice){
        for(int i = 0;i < brandType.size(); i++){

            int keylist = listID.get(i);
            String keyname = brandName.get(i);//sort ID with Insertion sort
            String keytype = brandType.get(i);
            int keyprice = brandPrice.get(i);

            int k=i-1;

            while(k >= 0 && brandType.get(k).compareTo(keytype) > 0){

                listID.set(k+1,listID.get(k));
                brandName.set(k+1,brandName.get(k));
                brandType.set(k+1,brandType.get(k));
                brandPrice.set(k+1,brandPrice.get(k));

                k = k-1;

            }

            listID.set(k+1,keylist);
            brandName.set(k+1, keyname);
            brandType.set(k+1, keytype);
            brandPrice.set(k+1, keyprice);

        }
    }

    public static int search(List<String>brandName, String searchName){
        int low=0;
        int high=brandName.size()-1;
        while(high>= low){
            int mid=(low+high)/2;
            if(brandName.get(mid).equalsIgnoreCase(searchName)){
                return mid;
            }else if(brandName.get(mid).compareTo(searchName)<0){
                low=mid+1;
            }else if(brandName.get(mid).compareTo(searchName)>0){
                high=mid-1;
            }
        }return-1;
    }

    public static void main(String[] args) {

        List<Integer> listID = new ArrayList<>();
        listID.add(10);
        listID.add(8);
        listID.add(5);
        listID.add(3);
        listID.add(1);
        listID.add(4);
        listID.add(7);
        listID.add(6);
        listID.add(2);
        listID.add(9);

        List<String> brandName = new ArrayList<>();
        brandName.add("Kit Kit");
        brandName.add("Heineken");
        brandName.add("Tiger");
        brandName.add("MAA MAA");
        brandName.add("Shin Shin");
        brandName.add("Carabao");
        brandName.add("Shark");
        brandName.add("PEP Milk");
        brandName.add("Warr");
        brandName.add("Htoo");

        List<String> brandType = new ArrayList<>();
        brandType.add("Chocolate Wafer");
        brandType.add("Beer");
        brandType.add("Beer");
        brandType.add("Noddle");
        brandType.add("Noddle");
        brandType.add("Energy Drink");
        brandType.add("Energy Drink");
        brandType.add("Milk Drink");
        brandType.add("Ice Cream");
        brandType.add("Ice Cream");


        List<Integer> brandPrice = new ArrayList<>();
        brandPrice.add(1100);
        brandPrice.add(2000);
        brandPrice.add(1500);
        brandPrice.add(400);
        brandPrice.add(500);
        brandPrice.add(800);
        brandPrice.add(900);
        brandPrice.add(1000);
        brandPrice.add(700);
        brandPrice.add(700);

        System.out.println("{{Welcome to our Projects.Convenience_Store}}");

        while (true){

            Scanner choiceScan = new Scanner(System.in);
            System.out.println("Would you like to see the items in our Convenience Store?\nOr\nWant to find the Items you want?");
            System.out.println("----------------------------------------------");
            System.out.println("If you want to see Item list, enter 1");
            System.out.println("If you want to search each Item name and Item type, enter 2");
            System.out.print("Enter 1 or 2 - ");
            int choice = choiceScan.nextInt();
            System.out.println("----------------------------------------------");

            while (choice < 1 || choice > 2){
                System.out.println("Please try again!!\nYou need to Enter 1 or 2 - ");
                choice = choiceScan.nextInt();
                System.out.println("----------------------------------------------");
            }

            if (choice == 1){
                System.out.printf("%-5s %-19s %-25s %-10s \n", "ID", "Name", "Type", "Price");
                for (int i = 0; i < listID.size(); i++){
                    listSort(listID,brandName,brandType,brandPrice);
                    System.out.printf("%-5s %-19s %-25s %-10s \n", listID.get(i), brandName.get(i), brandType.get(i), brandPrice.get(i));
                }
                System.out.println("-------------------------------------------------------------------");
            }else{
                while (true){

                    Scanner searchNameType = new Scanner(System.in);
                    System.out.println("Do you want to search Item Name or Type");
                    System.out.println("Search Item Name, enter 1\nSearch Item Type, enter 2");
                    System.out.print("Enter you want to search 1 or 2 - ");
                    int enterNameType = searchNameType.nextInt();
                    System.out.println("----------------------------------------------");

                    while (enterNameType < 1 || enterNameType > 2){
                        System.out.println("You need to enter 1 or 2, please try again!!");
                        System.out.print("Enter you want to search 1 or 2 - ");
                        enterNameType = searchNameType.nextInt();
                        System.out.println("----------------------------------------------");
                    }

                    if (enterNameType == 1){
                        Scanner scanner = new Scanner(System.in);
                        System.out.print("Enter you want to search Item - ");
                        String searchItem = scanner.nextLine();
                        System.out.println("----------------------------------------------");

                        sort(listID,brandName,brandType,brandPrice); //call sorting method
                        int index= search(brandName, searchItem); //call searching method

                        if (index == -1){
                            System.out.println("You want to search Item Name " + searchItem + " is not found.");
                        }else {
                            System.out.printf("%-5s %-19s %-25s %-10s \n", "ID", "Name", "Type", "Price");
                            System.out.printf("%-5s %-19s %-25s %-10s \n", listID.get(index), brandName.get(index), brandType.get(index), brandPrice.get(index));
                            System.out.println("----------------------------------------------");
                        }
                    }else{
                        Scanner typeScan = new Scanner(System.in);
                        System.out.print("Enter you want to search Item type - ");
                        String enterType = typeScan.nextLine();
                        System.out.println("----------------------------------------------");

                        typeSort(listID,brandName,brandType,brandPrice);
                        int indexType= search(brandType, enterType); //call searching method
                        if (indexType == -1){
                            System.out.println("You want to search Item Name " + enterType + " is not found.");
                        }else{
                            System.out.printf("%-5s %-19s %-25s %-10s \n", "ID", "Name", "Type", "Price");
                            for (int j = 0; j < brandType.size(); j++){
                                if (brandType.get(j).equals(enterType)){
                                    System.out.printf("%-5s %-19s %-25s %-10s \n", listID.get(j), brandName.get(j), brandType.get(j), brandPrice.get(j));
                                }

                            }
                            System.out.println("----------------------------------------------");
                        }
                    }
                    Scanner searchAgain = new Scanner(System.in);
                    System.out.println("Do you want to search Again?");
                    System.out.println("Yes = 1, No = 2");
                    System.out.print("Enter - ");
                    int againSearch = searchAgain.nextInt();

                    if (againSearch == 1){
                        System.out.println("----------------------------------------------");
                    }else {
                        System.out.println("Thank you for searching!!");
                        System.out.println("----------------------------------------------");
                        break;
                    }
                }
            }
            Scanner makeScan = new Scanner(System.in);
            System.out.println("Do you want to enter to know item list or search each item again?");
            System.out.println("Enter Yes or No");
            System.out.print("Enter - ");
            String make = makeScan.nextLine();

            if (make.equalsIgnoreCase("yes")){
                System.out.println("----------------------------------------------");
            }else {
                System.out.println("----------------------------------------------");
                System.out.println("Thank you\nGoodbye!!");
                break;
            }
        }
    }
}