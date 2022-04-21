package com.xyz.comptesManagement;

import java.sql.Date;

public class Program1 {
	
	public static void afficherDetailCompte(Compte compte) {
		
	}
		public static void main(String[] args) {
			Client client =new  Client(11,"Soukaina","Jini");
			Compte compte = new Compte(11,"12345",0, client);
			client.setCompte(compte);
			Operation op1=new Operation(new Date(2020,3,5), "VERS", 4444,compte);
			compte.addOperation(op1);
			Operation op2=new Operation(new Date(2020,3,7), "VERS", 3265,compte);
			compte.addOperation(op2);
			compte.addOperation (new Operation(new Date(2020,3,25), "RETR", 2000,compte));
			compte.addOperation (new Operation(new Date(2020,3,29), "RETR", 3000,compte));
			
			
		System.out.println("Client: "+client.getNom()+ "  "+client.getPrenom());
		System.out.println("Compte: "+compte.getNumero());
		System.out.println("Operations");	
		System.out.println("Date\t\t  Type\t\t Montant");
		
		for(Operation op : compte.getOperations()) {
			System.out.println(op.getDate() + "\t " +op.getType() + "\t\t " +op.getMontant());
			
			
			
			
			
			
			
				
			
		}
		} 
		}


