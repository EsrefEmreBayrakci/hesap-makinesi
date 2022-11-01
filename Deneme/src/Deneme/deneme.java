package Deneme;

import java.util.Scanner;

public class deneme {
	


public static void main(String[] args) {
	
	Scanner input=new Scanner(System.in);
	double sayi,sayi2,toplam=0,carpim=1;
	int secim;
	
	System.out.print("Sayı giriniz : ");
	sayi=input.nextInt();
	System.out.println("");
	
	while(true){
		
		System.out.println("1 - toplama  ");
		System.out.println("2 - çıkarma  ");
		System.out.println("3 - çarpma  ");
		System.out.println("4 - bölme  ");
		System.out.println("5 - çıkış  ");
		secim=input.nextInt();
		System.out.println();
		
		switch(secim) {
			
			case 1 :
				System.out.print("sayı giriniz : ");
				sayi2=input.nextInt();
				toplam=sayi+sayi2;
				sayi=toplam;
				System.out.println(toplam+"\n");
				break;
			case 2 :
				System.out.print("sayı giriniz : ");
				sayi2=input.nextInt();
				toplam=sayi-sayi2;
				sayi=toplam;
				System.out.println(toplam+"\n");
				break;
			case 3 :
				System.out.print("sayı giriniz : ");
				sayi2=input.nextInt();
				if(toplam==0) {
					carpim=sayi*sayi2;
					sayi=carpim;
					System.out.println(carpim+"\n");	
				}
				else {
					toplam=sayi*sayi2;
					sayi=toplam;
					System.out.println(toplam+"\n");
					
				}
				break;
			case 4 :
				System.out.print("sayı giriniz : ");
				sayi2=input.nextInt();
				if(toplam==0) {
					carpim=sayi/sayi2;
					sayi=carpim;
					System.out.println(carpim+"\n");	
				}
				else {
					toplam=sayi/sayi2;
					sayi=toplam;
					System.out.println(toplam+"\n");
					
				}
				break;
			case 5 :
				System.exit(0);
				break;
				
			default:
				System.out.println("geçersiz secim \n ");
		
		}
		
		
	}
	
	
	
	
}}