package be.steformation.af.client.ui.widget;




import com.google.gwt.user.client.Random;
import com.google.gwt.user.client.ui.HTMLTable.Cell;

import gwt.material.design.client.ui.MaterialColumn;
import gwt.material.design.client.ui.MaterialPanel;
import gwt.material.design.client.ui.MaterialRow;

public class MyTable extends MaterialPanel{
		String text;
		
		Case table[][] = new Case[4][4];
		
		public MyTable() {
			for (int i = 0; i < table.length; i++) {
	            MaterialRow ligne = new MaterialRow();
	            for (int j = 0; j < table.length; j++) {
	                MaterialColumn colonne = new MaterialColumn();
	                Case cellule = new Case();
	                colonne.add(cellule);
	                ligne.add(colonne);
	                table[i][j] = cellule;
	                int r = Random.nextInt(4);
	                int x = Random.nextInt(4);
	                if(i==r && j==x){
	                	int n = Random.nextInt(3);
	                	text = Integer.toString(n);
	                	cellule.setText("2"); 
	                }
	                int t = Random.nextInt(4);
	                int w = Random.nextInt(4);
	                if(i==t && j==w){
	                	cellule.setText("2"); 
	                }
	                
	            }
	            add(ligne);
	        }
				
			}

		}
		


		
	


