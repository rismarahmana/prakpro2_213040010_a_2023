/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studikasus;

import javax.swing.table.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Risma
 */

public class MyTabelBiodata extends AbstractTableModel {
    private String[] columnNames = { "Nama", "Nomor HP", "Jenis Kelamin", "Alamat" };
    private ArrayList<ArrayList<String>> data = new ArrayList<ArrayList<String>>();

    public int getColumnCount() {
        return columnNames.length;
    }

    public int getRowCount() {
        return data.size();
    }

    public int getColCount(int col) {
        return data.get(col).size();
    }

    public String getColumnName(int col) {
        return columnNames[col];
    }

    public Object getValueAt(int row, int col) {
        List<String> rowItem = data.get(row);
        return rowItem.get(col);
    }

    public boolean isCellEditable(int row, int col) {
        return row >= 0 && col >= 0;
    }

    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        List<String> rowItem = data.get(rowIndex);
        rowItem.set(columnIndex, (String) aValue);
        fireTableCellUpdated(rowIndex, columnIndex);
    }

    public void remove(int row) {
        data.remove(row);
        fireTableRowsDeleted(row, row);
    }

    void removeRow(int selectedRow) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void add(ArrayList<String> value) {
        data.add(value);
        fireTableRowsInserted(data.size() - 1, data.size() - 1);
    }
}