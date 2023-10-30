/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package studikasus;

import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JTable;

/**
 *
 * @author Risma
 */


public class MyTabelData {

    private ArrayList<ArrayList<String>> data = new ArrayList<ArrayList<String>>();
    
      public static void saveTableData(JTable table, String filePath) {
        try {
            BufferedWriter bWriter = new BufferedWriter(new FileWriter(filePath));
            
            for (int i = 0; i < table.getRowCount(); i++) {
                for (int j = 0; j < table.getColumnCount(); j++) {
                    bWriter.write(table.getValueAt(i, j).toString() + "\t");
                }
                bWriter.newLine();
            }
            
            bWriter.close();
        } catch (IOException e) {
            e.printStackTrace();         }
    }

    public void setData(ArrayList<String> data) {
        this.data.add(data);
    }

    public void remove(int row) {
        this.data.remove(row);
    }

    public String getData(int row, int col) {
        return data.get(row).get(col);
    }

    public ArrayList<String> getDataRow(int row) {
        return data.get(row);
    }

    public void setDataRow(int row, int col, String value) {
        data.get(row).set(col, value);
    }

    public int getSize(int row) {
        return data.get(row).size();
    }

    public int getSizeAll() {
        return data.size();
    }
}
