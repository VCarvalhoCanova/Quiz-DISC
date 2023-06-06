package questionario;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Perguntas implements ActionListener {
	private String [] qString = {"1.Eu sou...","2.Eu gosto de...","3.Se voce quiser se dar bem comigo...","4.Para conseguir obter bons resultados é preciso...",
			"5.Eu me divirto quando...","6.Eu penso que...","7.Minha preocupação é...","8.Eu prefiro que...","9.Eu gosto de...","10.Eu gosto de chegar...",
			"11.Um otimo dia pra mim é quando...", "12.Eu vejo a morte como...","13.Minha filosofia de vida é...","14.Eu sempre gostei de...",
			"15.Eu gosto de mudanças se...","16.Não existe nada de errado em...","17.Eu gosto de buscar conselhos de...","18. Meu lema é...",
			"19.Eu gosto de...","20.Tempo para mim é...","21.Se eu fosse bilionário...","22.Eu acredito que...","23.Eu acredito tambem que...",
			"24.Eu acredito ainda que...","25.Eu penso que..."};
	
	private String [] iString = {"Idealista, criativo e visionario","Explorar novas rotas","Me de liberdade","Ter incertezas","Tenho novidades",
			"É bom ser manso mas andar com um porrete","Gerar a ideia global","Perguntas a respostas","Tornar as pessoas confortaveis",
			"Em outro lugar","Desfruto de coisas novas e estimulantes","Uma grande aventura misteriosa","Para ganhar é necessário inventar novas regras",
			"Explorar","Me der mais liberdade e variedade","Mudar de ideia","Lugares, os mais estranhos","Fazer o que precisa ser feito",
			"Complexidade, mesmo se confuso","Irrelevante","Faria o que desse na cabeça","Bastam um navio e uma estrela para navegar",
			"Um sorriso ou uma careta é o mesmo pra quem é cego","A autoridade deve ser desafiada","Nao é facil ficar encurralado"};
	
	
	private String [] cString = {"Divertido, espiritual e benefico","Conversar com os passageiros","Seja amigavel, carinhoso e compreensivo",
			"Diversao e celebração","Estou com os outros","Unidos venceremos, divididos perderemos","Fazer com que as pessoas gostem",
			"Que todos tenham a chance de ser ouvido", "Construir memorias","Junto","Me divirto com meus amigos","Oportunidade para rever os falecidos",
			"Para eu ganhar ninguem precisa perder","Realizar uma abordagem natural","For divertido e puder ser compartilhado",
			"Colocar os outros na frente","Ancioes e conselheiros","Fazer junto com o grupo", "Calor humano e animação", "Um grande ciclo",
			"Faria doações para muitas caridades","A jornada é mais importante que a destinação", "O que vai volta",
			"O coletivo é mais importante que o individual", "Eu penso que duas cabeças pensam melhor que uma"};
	
	private String [] oString = {"Confiavel, meticuloso e previsivel","Planejar a viagem","Me deixe saber suas expectativas","Controlar o essencial",
			"Determino as regras","Um homem prevenido vale por dois","Fazer com que funcione","Ter todos os detalhes","Fazer sentido","Na hora",
			"Tudo segue conforme o planejado", "Um modo de receber recompensa", "Para ganhar é preciso seguir as regras", "Evitar surpresas",
			"Melhorar ou me der mais controle", "Ser consistente", "Autoriadades no assunto", "Fazer bem feito", "Ordem e sistemização",
			"Uma flecha que leva ao inevitável","Criaria uma poupança avantajada", "Um centavo economizado é um centavo ganho",
			"De grão em grão a galinha enche o papo","É melhor prudência que arrependimento","É preferível olhar, antes de pular"};
	
	private String [] aString = {"Focado, determinado e persistente","Ser Piloto","Lidere, siga ou saia do caminho","Planejar e obter recursos",
			"Estou me exercitando","O ataque é melhor que defesa","Fazer com que aconteça","Vantagens a meu favor","Fazer progresso","Na frente",
			"Consigo fazer muitas coisas","Algo que sempre chega muito cedo","Há ganhadores e perdedores, e eu acredito ser um ganhador",
			"Focalizar a meta", "Me der uma vantagem competitiva","Se colocar na frente","Pessoas bem-sucedidas","Simplesmente fazer",
			"Coisas claras e simples", "Algo que detesto desperdiçar", "Exibiria bastante com algumas pessoas","O destino é mais importante que a jornada",
			"Aquele que hesita esta perdido","Ganhar é fundamental","Não é fácil ficar encurralado"};
	
	
	private JLabel[]questionamento = new JLabel [25];
	private JLabel labelAguia,labelGato,labelLobo,labelTubarao;
	private JButton [] bt1= new JButton[25];
	private JButton [] bt2= new JButton[25];
	private JButton [] bt3= new JButton[25];
	private JButton [] bt4= new JButton[25];
	private JFrame frame = new JFrame();
	private int aguia=0, gato=0, lobo=0, tubarao=0,cont=0;
	
	
	Perguntas(){
		frame.setSize(1000, 1000);
		criarQuestionamento();
		criarButtons();
		criarPerguntas(0);
		criarFrame();
	}
	
	
	public void criarPerguntas(int i) {
		
		questionamento[i].setBounds(350, 100, 800, 100);
		frame.getContentPane().add(questionamento[i]);
		
		
    	bt1[i].setBounds(50, 200, 350, 100);
    	bt1[i].setFocusable(false);
    	bt1[i].addActionListener(this);
    	frame.getContentPane().add(bt1[i]);
    	
 
    	bt2[i].setBounds(50, 600, 350, 100);
    	bt2[i].setFocusable(false);
    	bt2[i].addActionListener(this);
    	frame.getContentPane().add(bt2[i]);
    	
    	bt3[i].setBounds(450, 200, 350, 100);
    	bt3[i].setFocusable(false);
    	bt3[i].addActionListener(this);
    	frame.getContentPane().add(bt3[i]);
    	
    	bt4[i].setBounds(450, 600, 350, 100);
    	bt4[i].setFocusable(false);
    	bt4[i].addActionListener(this);
    	frame.getContentPane().add(bt4[i]);
    	
    	
    	
    	
	}
	
	public void criarQuestionamento() {
		for(int i=0;i<25;i++) {
			questionamento[i] = new JLabel(qString[i]);
		}
	}
	
	
	public void criarButtons() {
		for(int i=0;i<25;i++) {
			bt1[i] = new JButton("I-"+iString[i]);
			bt2[i]= new JButton("O-"+oString[i]);
			bt3[i]= new JButton("C-"+cString[i]);
			bt4[i]= new JButton("A-"+aString[i]);
		}
	}
	
	public void mostrarResultados(int aguia,int gato,int lobo, int tubarao ) {
		
		labelAguia = new JLabel("Percentual de Águia: "+aguia*4+"%");
		labelAguia.setBounds(50, 200, 350, 100);
    	frame.getContentPane().add(labelAguia);
    	
    	labelLobo = new JLabel("Percentual de Lobo: "+lobo*4+"%");
    	labelLobo.setBounds(50, 600, 350, 100);
    	frame.getContentPane().add(labelLobo);
    	
    	labelGato = new JLabel("Percentual de Gato: "+gato*4+"%");
    	labelGato.setBounds(450, 200, 350, 100);
    	frame.getContentPane().add(labelGato);
    	
    	labelTubarao = new JLabel("Percentual de Tubarão: "+tubarao*4+"%");
    	labelTubarao.setBounds(450, 600, 350, 100);
    	frame.getContentPane().add(labelTubarao);
	}
	
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==bt1[cont]) {
			aguia=aguia+1;
			//System.out.println(""+aguia);
		}else if(e.getSource()==bt2[cont]) {
			lobo=lobo+1;
			//System.out.println(lobo);
		}else if(e.getSource()==bt3[cont]) {
			gato=gato+1;
			//System.out.println(gato);
		}else if(e.getSource()==bt4[cont]) {
			tubarao=tubarao+1;
			//System.out.println(tubarao);
		}
		cont = cont+1;
		frame.getContentPane().removeAll();
		
		if(cont==25) {
			mostrarResultados(aguia,gato,lobo,tubarao);
		}else {
			criarPerguntas(cont); 
		}
		frame.repaint();
	}
	
	
	public void criarFrame() {
	    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    	frame.setLayout(null);
		    frame.setVisible(true);
		}
	
	
	public static void main(String[] args) {
		Perguntas p = new Perguntas();
		System.out.println("teste");
	}


	
	
}
