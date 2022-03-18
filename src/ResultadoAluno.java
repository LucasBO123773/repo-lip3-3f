import javax.swing.JOptionPane;

public class ResultadoAluno {

	public static void main(String[] args) {
	
		double n1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Nota_1º" ));
		double n2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Nota_2º" ));
		double n3 = Double.parseDouble(JOptionPane.showInputDialog(null,"Nota_3º" ));
		
		double media = (n1 + (n2*2) + (n3*2))/5;
		
		if(media < 6 ) {
			JOptionPane.showMessageDialog(null, "Você foi Reprovado sua nota é " + media);
	}else {
		JOptionPane.showMessageDialog(null, "Você foi Aprovado sua nota é " + media);
	}

}
}
