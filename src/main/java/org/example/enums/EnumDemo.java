package org.example.enums;

public class EnumDemo {

    public static void main(String[] args) {

        Priority priority = Priority.HIGH;
        System.out.println(priority);

        switch (priority){
            case HIGH:
                System.out.println("High priority");
                break;
            case MEDIUM:
                System.out.println("Medium priority");
                break;
            case LOW:
                System.out.println("Low priority");
                break;
        }

        System.out.println(Priority.HIGH.ordinal());

        Priority[] values = Priority.values();
        for (Priority priority1 : values) {
            System.out.println(priority1);
        }


        System.out.println("Month.JANVIER.getDaysAmount() : " + Month.JANVIER.getDaysAmount());

    }
}
