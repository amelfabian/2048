package be.steformation.af.client.ui.widget;




import com.google.gwt.core.shared.GWT;
import com.google.gwt.user.client.Random;
import com.google.gwt.user.client.ui.HTMLTable.Cell;

import gwt.material.design.client.ui.MaterialColumn;
import gwt.material.design.client.ui.MaterialPanel;
import gwt.material.design.client.ui.MaterialRow;

public class MyTable extends MaterialPanel{
		String text;
		
		Case table[][] = new Case[4][4];
		
		public MyTable() {
			GWT.log("MyTable.MyTable()");
		     int t = Random.nextInt(4);
             int w = Random.nextInt(4);
             int r = Random.nextInt(4);
             int x = Random.nextInt(4);
			for (int i = 0; i < table.length; i++) {
	            MaterialRow ligne = new MaterialRow();
	            for (int j = 0; j < table.length; j++) {
	                MaterialColumn colonne = new MaterialColumn();
	                Case cellule = new Case();
	                colonne.add(cellule);
	                ligne.add(colonne);
	                table[i][j] = cellule;
	      
	                if(i==r && j==x){
	                	int n = Random.nextInt(3);
	                	text = Integer.toString(n);
	                	cellule.setText("2"); 
	                }
	           
	                if(i==t && j==w){
	                	cellule.setText("2"); 
	                }
	                
	            }
	            add(ligne);
	        }
				
			}

		}
		


		
	


