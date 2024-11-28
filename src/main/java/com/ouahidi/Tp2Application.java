package com.ouahidi;

import java.util.Calendar;
 

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

 
import com.ouahidi.entities.Client1;
import com.ouahidi.entities.Client2;
import com.ouahidi.entities.Client3;
import com.ouahidi.entities.Commande1;
import com.ouahidi.entities.Commande2;
import com.ouahidi.entities.Commande3;
import com.ouahidi.repositories.Client1Repository;
import com.ouahidi.repositories.Client2Repository;
import com.ouahidi.repositories.Client3Repository;
import com.ouahidi.repositories.Commande1Repository;
import com.ouahidi.repositories.Commande2Repository;
import com.ouahidi.repositories.Commande3Repository;

@SpringBootApplication
public class Tp2Application {

	public static void main(String[] args) {
		SpringApplication.run(Tp2Application.class, args);
	}

	@Bean
CommandLineRunner start(
		//Client1Repository client1Repository,
		 //Commande1Repository commande1Repository
		//Client2Repository client2Repository,
		//				 Commande2Repository commande2Repository
	Client3Repository client3Repository, Commande3Repository commande3Repository
	)
	{return args -> {
	 //Tester Navigation Commande1 vers Client1. On ne peut faire
	 //dans l'autre sens
/*
			Client1 c1 = Client1.builder()
					.nom("Sara")
					.email("sara@yahoo.ma")
					.build();
			       client1Repository.save(c1);

			Client1 c2 = Client1.builder()
					.nom("Mohammed")
					.email("mohammed@fsr.ac.ma")
					.build();

			client1Repository.save(c2);

			Client1 c3 = Client1.builder()
					.nom("Naima")
					.email("naima.mechouate@um5r.ac.ma")
					.build();

			client1Repository.save(c3);

			 Calendar a = Calendar.getInstance();
			 Integer  year =  a.get(Calendar.YEAR);

			 Commande1 cm1 = Commande1.builder()
			    		.montant(90000.0)
			    		.creatDate(year)
			    		.client(c3)
			    		.build();

			       commande1Repository.save(cm1);

			      Commande1 cm2 = Commande1.builder()
			       		.montant(70000.0)
			       		.creatDate(year)
			       		.client(c2)
			       		.build();

			          commande1Repository.save(cm2);


			          Commande1 cm3 = Commande1.builder()
					       		.montant(30000.0)
					       		.creatDate(year)
					       		.client(c1)
					       		.build();
					          commande1Repository.save(cm3);
							  Commande1 cm= commande1Repository.findById(1).get();

		System.out.println("De commande vers client=============================");
	   System.out.println("Nom client "+cm.getClient().getNom());
		System.out.println("Montant = "+ cm.getMontant());
*/
	// ==============================================================
	 //Tester Navigation dans les deux sens avec Client2 et Commande2 */
/*
Client2 c1 = Client2.builder()
				.nom("Sara")
				.email("sara@yahoo.ma")
				.build();
		client2Repository.save(c1);

		Client2 c2 = Client2.builder()
				.nom("Mohammed")
				.email("mohammed@fsr.ac.ma")
				.build();

		client2Repository.save(c2);

		Client2 c3 = Client2.builder()
				.nom("Naima")
				.email("naima.mechouate@um5r.ac.ma")
				.build();

		client2Repository.save(c3);

		Calendar a = Calendar.getInstance();
		 Integer  year =  a.get(Calendar.YEAR);
		 Commande2 cm1 = Commande2.builder()
		    		.montant(90000.0)
		    		.creatDate(year)
		    		.client(c2)
		    		.build();

		       commande2Repository.save(cm1);

		      Commande2 cm2 = Commande2.builder()
		       		.montant(70000.0)
		       		.creatDate(year)
		       		.client(c1)
		       		.build();

		          commande2Repository.save(cm2);


		          Commande2 cm3 = Commande2.builder()
				       		.montant(30000.0)
				       		.creatDate(year)
				       		.client(c3)
				       		.build();

				          commande2Repository.save(cm3);


	 Client2 c = client2Repository.findById(1).get();
	System.out.println("Navigation de Client2 vers Commande2");

	System.out.println("Nom client " +c.getNom());
	System.out.println("Montant de sa commande "+c.getCommande().getMontant());


	Commande2 cm= commande2Repository.findById(1).get();
	System.out.println("Navigation de Commande2 vers Client2");
	System.out.println("Nom client " +cm.getClient().getNom());
	System.out.println("Montant de sa commande "+cm.getMontant());

*/
	/* ==========avec Table d'association Commande3 et Client3 =============== */


    Client3 c1 = Client3.builder()
			.nom("Sara")
			.email("sara@yahoo.ma")
			.build();
	client3Repository.save(c1);
	
	Client3 c2 = Client3.builder()
			.nom("Mohammed")
			.email("mohammed@fsr.ac.ma")
			.build();
	
	client3Repository.save(c2);
	
	Client3 c3 = Client3.builder()
			.nom("Naima")
			.email("naima.mechouate@um5r.ac.ma")
			.build();
	
	client3Repository.save(c3);
	
	Calendar a = Calendar.getInstance();
	 Integer  year =  a.get(Calendar.YEAR);

	 Commande3 cm1 = Commande3.builder()
	    		.montant(90000.0)
	    		.creatDate(year)
	    		.client(c2)
	    		.build();
	    
	       commande3Repository.save(cm1);
	  
	      Commande3 cm2 = Commande3.builder()
	       		.montant(70000.0)
	       		.creatDate(year)
	       		.client(c1)
	       		.build();
	       
	          commande3Repository.save(cm2);
	          
   
	          Commande3 cm3 = Commande3.builder()
			       		.montant(30000.0)
			       		.creatDate(year)
			       		.client(c3)
			       		.build();
			       
      commande3Repository.save(cm3);
	
      Client3 c = client3Repository.findById(1).get();

      Commande3 cm= commande3Repository.findById(1).get();
    System.out.println("Navigation de Client3 vers Commande3");
    
    System.out.println("Nom client " +c.getNom());
    System.out.println("Montant de sa commande "+c.getCommande().getMontant());
    
    
    System.out.println("Navigation de Commande3 vers Client3");
    System.out.println("Nom client " +cm.getClient().getNom());
    System.out.println("Montant de sa commande "+cm.getMontant());




};


}

}
