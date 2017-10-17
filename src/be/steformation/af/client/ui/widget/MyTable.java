package be.steformation.af.client.ui.widget;




import gwt.material.design.client.ui.MaterialColumn;
import gwt.material.design.client.ui.MaterialPanel;
import gwt.material.design.client.ui.MaterialRow;

public class MyTable extends MaterialPanel{
	
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
	            }
	            add(ligne);
	        }
				
			}
		}
		


		
	


