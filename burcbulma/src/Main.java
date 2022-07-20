import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int gun, ay;
        String burc = "";
        boolean isHata = false;
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Ay giriniz: ");
        ay = sc.nextInt();

        System.out.print("Gün giriniz: ");
        gun = sc.nextInt();


        if (ay == 1) {
            if (1 <= gun && gun <= 31) {
                if (gun < 22) {
                    burc = "Oğlak";
                } else {
                    burc = "Kova";
                }
            } else {
                isHata = true;
            }
        } else if (ay == 2) {
            if (1 <= gun && gun <= 28) {
                if (gun < 20) {
                    burc = "Kova";
                } else {
                    burc = "Balık";
                }
            } else {
                isHata = true;
            }
        } else if (ay == 3) {
            if (1 <= gun && gun <= 31) {
                if (gun < 21) {
                    burc = "Balık";
                } else {
                    burc = "Koç";
                }
            } else {
                isHata = true;
            }
        } else if (ay == 4) {
            if (1 <= gun && gun <= 31) {
                if (gun < 21) {
                    burc = "Koç";
                } else {
                    burc = "Boğa";
                }
            } else {
                isHata = true;
            }
        } else if (ay == 5) {
            if (1 <= gun && gun <= 31) {
                if (gun < 22) {
                    burc = "Boğa";
                } else {
                    burc = "İkizler";
                }
            } else {
                isHata = true;
            }
        } else if (ay == 6) {
            if (1 <= gun && gun <= 31) {
                if (gun < 23) {
                    burc = "İkizler";
                } else {
                    burc = "Yengeç";
                }
            } else {
                isHata = true;
            }
        } else if (ay == 7) {
            if (1 <= gun && gun <= 31) {
                if (gun < 23) {
                    burc = "Yengeç";
                } else {
                    burc = "Aslan";
                }
            } else {
                isHata = true;
            }
        } else if (ay == 8) {
            if (1 <= gun && gun <= 31) {
                if (gun < 23) {
                    burc = "Aslan";
                } else {
                    burc = "Başak";
                }
            } else {
                isHata = true;
            }
        } else if (ay == 9) {
            if (1 <= gun && gun <= 31) {
                if (gun < 23) {
                    burc = "Başak";
                } else {
                    burc = "Terazi";
                }
            } else {
                isHata = true;
            }
        } else if (ay == 10) {
            if (1 <= gun && gun <= 31) {
                if (gun < 23) {
                    burc = "Terazi";
                } else {
                    burc = "Akrep";
                }
            } else {
                isHata = true;
            }
        } else if (ay == 11) {
            if (1 <= gun && gun <= 31) {
                if (gun < 22) {
                    burc = "Akrep";
                } else {
                    burc = "Yay";
                }
            } else {
                isHata = true;
            }
        } else if (ay == 12) {
            if (1 <= gun && gun <= 31) {
                if (gun < 22) {
                    burc = "Yay";
                } else {
                    burc = "Oğlak";
                }
            } else {
                isHata = true;
            }
        } else {
            isHata = true;
        }

        if (isHata) {
            System.out.println("Hatalı Değer Girdiniz.Lütfen Tekrar Giriniz.");
        } else {
            System.out.println("Burcunuz: " + burc);
        }

    }
}