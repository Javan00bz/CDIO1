/**
 Klasse der styrer udseendet af brættet.
 */

package spil;

import java.awt.Color;

import desktop_fields.*;
import desktop_resources.GUI;

public class Board {
	
	public void BoardController(){
	Field [] fields = new Field[40];
	fields[0] = new Street.Builder().setTitle("Start").setSubText("").setDescription("").setBgColor(Color.green).build();
	fields[1] = new Street.Builder().setTitle("2").setDescription("").setSubText("").build();
	fields[2] = new Street.Builder().setTitle("3").setDescription("").setSubText("").build();
	fields[3] = new Street.Builder().setTitle("4").setDescription("").setSubText("").build();
	fields[4] = new Street.Builder().setTitle("5").setDescription("").setSubText("").build();
	fields[5] = new Street.Builder().setTitle("6").setDescription("").setSubText("").build();
	fields[6] = new Street.Builder().setTitle("7").setDescription("").setSubText("").build();
	fields[7] = new Street.Builder().setTitle("8").setDescription("").setSubText("").build();
	fields[8] = new Street.Builder().setTitle("9").setDescription("").setSubText("").build();
	fields[9] = new Street.Builder().setTitle("10").setDescription("").setSubText("").build();
	fields[10] = new Street.Builder().setTitle("11").setDescription("").setSubText("").build();
	fields[11] = new Street.Builder().setTitle("12").setDescription("").setSubText("").build();
	fields[12] = new Street.Builder().setTitle("13").setDescription("").setSubText("").build();
	fields[13] = new Street.Builder().setTitle("14").setDescription("").setSubText("").build();
	fields[14] = new Street.Builder().setTitle("15").setDescription("").setSubText("").build();
	fields[15] = new Street.Builder().setTitle("16").setDescription("").setSubText("").build();
	fields[16] = new Street.Builder().setTitle("17").setDescription("").setSubText("").build();
	fields[17] = new Street.Builder().setTitle("18").setDescription("").setSubText("").build();
	fields[18] = new Street.Builder().setTitle("19").setDescription("").setSubText("").build();
	fields[19] = new Street.Builder().setTitle("20").setDescription("").setSubText("").build();
	fields[20] = new Street.Builder().setTitle("21").setDescription("").setSubText("").build();
	fields[21] = new Street.Builder().setTitle("22").setDescription("").setSubText("").build();
	fields[22] = new Street.Builder().setTitle("23").setDescription("").setSubText("").build();
	fields[23] = new Street.Builder().setTitle("24").setDescription("").setSubText("").build();
	fields[24] = new Street.Builder().setTitle("25").setDescription("").setSubText("").build();
	fields[25] = new Street.Builder().setTitle("26").setDescription("").setSubText("").build();
	fields[26] = new Street.Builder().setTitle("27").setDescription("").setSubText("").build();
	fields[27] = new Street.Builder().setTitle("28").setDescription("").setSubText("").build();
	fields[28] = new Street.Builder().setTitle("29").setDescription("").setSubText("").build();
	fields[29] = new Street.Builder().setTitle("30").setDescription("").setSubText("").build();
	fields[30] = new Street.Builder().setTitle("31").setDescription("").setSubText("").build();
	fields[31] = new Street.Builder().setTitle("32").setDescription("").setSubText("").build();
	fields[32] = new Street.Builder().setTitle("33").setDescription("").setSubText("").build();
	fields[33] = new Street.Builder().setTitle("34").setDescription("").setSubText("").build();
	fields[34] = new Street.Builder().setTitle("35").setDescription("").setSubText("").build();
	fields[35] = new Street.Builder().setTitle("36").setDescription("").setSubText("").build();
	fields[36] = new Street.Builder().setTitle("37").setDescription("").setSubText("").build();
	fields[37] = new Street.Builder().setTitle("38").setDescription("").setSubText("").build();
	fields[38] = new Street.Builder().setTitle("39").setDescription("").setSubText("").build();
	fields[39] = new Street.Builder().setTitle("goal").setSubText("").setDescription("").setBgColor(Color.cyan).build();
	
	GUI.create(fields);
	}

}
