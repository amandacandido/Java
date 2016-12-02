
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ClienteTableModel extends AbstractTableModel{
    private List<Cliente> dados;
    private String[] colunas = {"Nome", "Sobrenome", "CPF", "RG", "Endereco"};
            
    public ClienteTableModel(){
        dados = new ArrayList<>();
    }
     
    public void addRow(Cliente c){
        this.dados.add(c);
        this.fireTableDataChanged();
    }
    public void removeRow(int linha){
        this.dados.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    }
    
    public Cliente get(int linha){
    return this.dados.get(linha);
    }
    
    @Override
    public String getColumnName(int num){
        return this.colunas[num];
    }
 
    @Override
    public int getRowCount() {
        return dados.size();
    }
 
    @Override
    public int getColumnCount() {
        return colunas.length;
    }
 
    @Override
    public Object getValueAt(int linha, int coluna) {
        switch(coluna){
            case 0: return dados.get(linha).getNome();
            case 1: return dados.get(linha).getSobrenome();
            case 2: return dados.get(linha).getCPF();
            case 3: return dados.get(linha).getRG();
            case 4: return dados.get(linha).getEndereco();
        }   
        return null;
    }    
}
