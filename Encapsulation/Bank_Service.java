import java.util.Scanner;

class Account {
            Scanner sc = new Scanner(System.in);

    private String accountHolderName;
    private String address;
    private long addharNumber;
    private String panNumber;
    private int upiPin;
    private double balance;
    private long phoneNumber;

    Account(String accountHolderName, String address, long addharNumber,String panNumber, int upiPin, double balance, long phoneNumber) {
        this.accountHolderName = accountHolderName;
        this.address = address;
        this.addharNumber=addharNumber;
        this.panNumber = panNumber;
        this.upiPin = upiPin;
        this.balance = balance;
        this.phoneNumber = phoneNumber;
    }
    public void displayInfo()
    {
        System.out.println("Account Holder name :" + accountHolderName);
        System.out.println("Address :" +address);
        System.out.println(" Aadhar number : "+addharNumber);
        System.out.println("Pan number : "+ panNumber);
        System.out.println("phoneNumber : "+ phoneNumber);
    }

    public void setAccountHolderName(String updateName) {
        this.accountHolderName = updateName;
        System.out.println("name updated successfully ");
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAddress(String uadd) {
        this.address = uadd;
         System.out.println("Address updated successfully ");
    }

    public String getAddress() {
        return address;
    }
    public long getAdharNumber() {
        return addharNumber;
    }
    public String getPanNumber() {
        return panNumber;
    }

    public void setUpi(int uupi) {
        this.upiPin = uupi;
        System.out.println("upi pin updated successfully");
    }

    public void setPhone(long uphone) {
        this.phoneNumber = uphone;
         System.out.println("phoneNumber updated successfully ");
    }

    public long getPhone() {
        return phoneNumber;
    }

    public double getBalance() {
        System.out.println("Enter pin");
        int a=sc.nextInt();
        if(a==upiPin)
        {
            return balance;

        }else 
        {
             System.out.println("Wrong upi pin , please provide valid pin");
         }
         return 0;

        
        
    }

    public void deposit(double amount) {
        balance =balance+ amount;
        System.out.println("Amount deposited successfully. Updated balance: " + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance = balance - amount;
            System.out.println("Amount withdrawn successfully. Updated balance: " + balance);
        } 
        else 
        {
            System.out.println("Insufficient balance. Withdrawal failed.");
        }
    }
}

public class Bank_Service {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account obj = null;
        boolean exit = false;
        boolean exit1=true;
                
        double balance = 0; // Declare cbal outside the switch statement

        while (!exit) {
            System.out.println("1. Create Account");
            System.out.println("2. Existing User");
            System.out.println("3. Exit");
            System.out.println("Choose option");
            int num = sc.nextInt();

            switch (num) {
                case 1: {
                    System.out.println("Enter Name:");
                    String accountHolderName = sc.next();
                    System.out.println("Enter Address");
                    String address = sc.next();
                    System.out.println("Enter adhar number");
                    long addharNumber=sc.nextLong();
                    System.out.println("Enter Pan Number");
                    String panNumber = sc.next();
                    System.out.println("Enter Upi Pin");
                    int upiPin = sc.nextInt();
                    System.out.println("Enter Balance");
                    balance = sc.nextDouble(); // udpated current balance
                    System.out.println("Enter Phone Number");
                    long phoneNumber = sc.nextLong();
                    System.out.println("Account Created Successfully");

                    obj = new Account(accountHolderName, address, addharNumber,panNumber, upiPin, balance, phoneNumber);
                }
                break;

                
                
                case 2: {
                    if (obj != null) {
                        while(exit1)
                        {
                        System.out.println("1. Check Balance");
                        System.out.println("2. Deposit Amount");
                        System.out.println("3. Withdrawal Amount");
                        System.out.println("4. Update Account");
                        System.out.println("5. Get user Information");
                        System.out.println("6. Logout");
                        System.out.println("Choose option");
                        int num1 = sc.nextInt();

                        switch (num1) {
                            case 1: {
                                System.out.println("Balance is: " + obj.getBalance());
                            }
                            break;

                            case 2: {
                                System.out.println("Enter Deposit amount:");
                                double deposit = sc.nextDouble();
                                obj.deposit(deposit);
                            }
                            break;

                            case 3: {
                                System.out.println("Enter Withdrawal amount:");
                                double withdrawal = sc.nextDouble();
                                obj.withdraw(withdrawal);
                            }
                            break;

                            case 4: {
                                System.out.println("1. Account Holder Name");
                                System.out.println("2. Address");
                                System.out.println("3. UPI Pin");
                                System.out.println("4. Phone Number");
                                System.out.println("Choose option");
                                int num2 = sc.nextInt();

                                switch (num2) {
                                    case 1: {
                                        System.out.println("Enter New name:");
                                        String uname = sc.next();
                                        obj.setAccountHolderName(uname);
                                    }
                                    break;

                                    case 2: {
                                        System.out.println("Enter New Address:");
                                        String uadd = sc.next();
                                        obj.setAddress(uadd);
                                    }
                                    break;

                                    case 3: {
                                        System.out.println("Enter New UPI:");
                                        int uupi = sc.nextInt();
                                        obj.setUpi(uupi);
                                    }
                                    break;

                                    case 4: {
                                        System.out.println("Enter New Phone Number:");
                                        long uphone = sc.nextLong();
                                        obj.setPhone(uphone);
                                    }
                                    break;

                                    default:
                                        System.out.println("Error ! please enter Correct Option");
                                }
                            }
                            break;
                        case 5:
                            {
                                obj.displayInfo();
                            }
                            break;

                            case 6: 
                            {
                                obj = null;
                                System.out.println("Logged out successfully.");
                                exit=false;
                                System.exit(0);
                            }

                            break;

                            default:
                                System.out.println("Error enter correct option");
                        }
                    }
                    } 

                    else 
                    {
                        System.out.println("Create account first");
                    }
                }
                break;

                case 3: {
                    exit = true;
                    System.out.println("Exiting program.");
                }
                break;

                default:
                    System.out.println("Error ! Enter Correct Option");
            }
        
        }

        
    }
}