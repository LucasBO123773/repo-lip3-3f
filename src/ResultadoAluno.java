import javax.swing.JOptionPane;

public class ResultadoAluno {

	public static void main(String[] args) {
	
		double n1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Nota_1�" ));
		double n2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Nota_2�" ));
		double n3 = Double.parseDouble(JOptionPane.showInputDialog(null,"Nota_3�" ));
		
		double media = (n1 + (n2*2) + (n3*2))/5;
		
		if(media < 6 ) {
			JOptionPane.showMessageDialog(null, "Voc� foi Reprovado sua nota � " + media);
	}else {
		JOptionPane.showMessageDialog(null, "Voc� foi Aprovado sua nota � " + media);
	}

}
}
