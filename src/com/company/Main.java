package com.company;

public class Main {

    public static void main(String[] args) {
	float basic = 25000,DA,HRA,CCA,PF,Pt,gross,net;
    DA = 0.7f * basic;
    HRA =0.3f*basic;
    CCA =240;
    gross = DA+HRA+CCA+basic;
    net = gross-(0.1f*basic)-100;
        System.out.println("gross - and net- "+gross+" "+net);
    }
}
