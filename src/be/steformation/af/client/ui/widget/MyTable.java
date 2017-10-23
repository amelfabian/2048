package be.steformation.af.client.ui.widget;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.user.client.Random;
import com.google.gwt.user.client.ui.HTMLTable.Cell;

import be.steformation.af.client.event.EventManager;
import be.steformation.af.client.event.direction.Direction;
import be.steformation.af.client.event.direction.IDirection;
import gwt.material.design.client.ui.MaterialColumn;
import gwt.material.design.client.ui.MaterialPanel;
import gwt.material.design.client.ui.MaterialRow;

public class MyTable extends MaterialPanel implements IDirection {
	String text;
	int t = Random.nextInt(4);
	int w = Random.nextInt(4);
	int r = Random.nextInt(4);
	int x = Random.nextInt(4);

	Case table[][] = new Case[4][4];

	public MyTable() {
		GWT.log("MyTable.MyTable()");
		EventManager.getInstance().addHandler(Direction.type, this);
		for (int i = 0; i < table.length; i++) {
			MaterialRow ligne = new MaterialRow();
			for (int j = 0; j < table.length; j++) {
				MaterialColumn colonne = new MaterialColumn();
				Case cellule = new Case();
				colonne.add(cellule);
				ligne.add(colonne);
				table[i][j] = cellule;
				int deb = Random.nextInt(4) + 1;
				if (deb == 1) {
					deb = 4;
				} else {
					deb = 2;
				}
				String debut = Integer.toString(deb);
				if (i == r && j == x) {
					int n = Random.nextInt(3);
					text = Integer.toString(n);
					cellule.setText(debut);
				}
				deb = Random.nextInt(4) + 1;
				if (deb == 1) {
					deb = 4;
				} else {
					deb = 2;
				}
				if (i == t && j == w) {
					cellule.setText(debut);
				}

			}
			add(ligne);
		}

	}

	@Override
	public void OnDown(Direction event) {
		GWT.log("MyTable.OnDown()" + event);

	}

	@Override
	public void OnUp(Direction event) {
		GWT.log("MyTable.OnUp()");

	}

	@Override
	public void OnLeft(Direction event) {
		GWT.log("MyTable.OnLeft()");

		
		Case tableTrav[][] = new Case[4][4];
		tableTrav = WorkTable();
		int k=0;
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table.length; j++) {
				if(!table[i][j].getText().equals("0")){
				if(tableTrav[i][k].getText().equals("0")){
				
					String t= table[i][j].getText();
					tableTrav[i][k].setText(t);
					k++;
				
			}else{
				k++;
			}
			}
		}
		}
		
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table.length; j++){
				String var = tableTrav[i][j].getText();
				table[i][j].setText(var);
			}
		}
	}

	@Override
	public void OnRight(Direction event) {
		GWT.log("MyTable.OnRight()");
		Case tableTrav[][] = new Case[4][4];
	
			tableTrav= WorkTable();
	
		
		int k=3;
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table.length; j++) {
				if(!table[i][j].getText().equals("0")){
				if(tableTrav[i][k].getText().equals("0")){
				
					String t= table[i][j].getText();
					tableTrav[i][k].setText(t);
					k++;
				
			}else{
				k++;
			}
			}
		}
		}
		
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table.length; j++){
				String var = tableTrav[i][j].getText();
				table[i][j].setText(var);
			}
		}
	}

	public Case[][] WorkTable() {
		Case WorkTable[][] = new Case[4][4];
		for (int i = 0; i < table.length; i++) {
			MaterialRow ligne = new MaterialRow();
			for (int j = 0; j < table.length; j++) {
				MaterialColumn colonne = new MaterialColumn();
				Case cellule = new Case();
				colonne.add(cellule);
				ligne.add(colonne);
				table[i][j] = cellule;

			}
		}
		return WorkTable;
	}

}
