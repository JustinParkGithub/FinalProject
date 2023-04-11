package finalproject;

import java.util.ArrayList;
import javax.swing.JLabel;

public class GenerateLabel extends Thread {

    //Variabels for labels - Written by Justin
    private GameFrame f;
    private RandomWords r;
    
    private JLabel label1 = new JLabel("one");
    private JLabel label2 = new JLabel("two");
    private JLabel label3 = new JLabel("three");
    private JLabel label4 = new JLabel("four");
    private JLabel label5 = new JLabel("five");
    private ArrayList<JLabel> labelArr = new ArrayList<>();

    //Class constructor, connects GameFrame and RandomWords to GenerateLabel, adds lables to ArrayList for ease of use, used in GameFrame - Written by Justin
    public GenerateLabel(GameFrame form, RandomWords randomWords) {
        f = form;
        r = randomWords;
        labelArr.add(label1);
        labelArr.add(label2);
        labelArr.add(label3);
        labelArr.add(label4);
        labelArr.add(label5);
        for (int i = 0; i < labelArr.size(); i++) {
            f.add(labelArr.get(i));
        }
    }

    //Divides Game Frame into sections and places a label in each section randomly, used in GameFrame - Written by Justin
    public void locationLabel() {
        //Randomly places the labels at the top
        for (int i = 0; i < labelArr.size(); i++) {
            int max = ((815 - 6) / (labelArr.size())) * (i + 1) + 6;
            int min = ((815 - 6) / (labelArr.size())) * i + 6;
            int random = (int) (Math.random() * (max - min + 1) + min);
            labelArr.get(i).setBounds(random, 114, 100, 30);
            System.out.println(random);
        }
    }
    
    public void randomLocationLabel(int i) {
            int max = ((815 - 6) / (labelArr.size())) * (i + 1) + 6;
            int min = ((815 - 6) / (labelArr.size())) * i + 6;
            int random = (int) (Math.random() * (max - min + 1) + min);
            labelArr.get(i).setLocation(random, 114);
            System.out.println(random);
    }

    //Accessor methods for labels, used in GameFrame - Written by Justin
    public String getLabel1Text() {
        return label1.getText();
    }

    public String getLabel2Text() {
        return label2.getText();
    }

    public String getLabel3Text() {
        return label3.getText();
    }

    public String getLabel4Text() {
        return label4.getText();
    }

    public String getLabel5Text() {
        return label5.getText();
    }

    public String getLabelText(int i) {
        return labelArr.get(i).getText();
    }

    //Modifier methods for the labels, used in GameFrame - Written by Justin
    public void label1Text(String str) {
        label1.setText(str);
    }

    public void label2Text(String str) {
        label2.setText(str);
    }

    public void label3Text(String str) {
        label3.setText(str);
    }

    public void label4Text(String str) {
        label4.setText(str);
    }

    public void label5Text(String str) {
        label5.setText(str);
    }

    public void labelText(int i, String str) {
        labelArr.get(i).setText(str);
    }

    //Writes random words into labels, used in GameFrame - Written by Justin
    public void assignWords() {
        r.makeArrayList();
        for (int i = 0; i < labelArr.size(); i++) {
            labelArr.get(i).setText(r.getRandomWords());
        }
    }

    //Checks if all labels are empty, used in GameFrame - Written by Justin
    public boolean allEmptyLabels() {
        int counter = 0;
        for (int i = 0; i < labelArr.size(); i++) {
            if (labelArr.get(i).getText() == "") {
                counter++;
            }
        }
        if (counter == labelArr.size()) {
            return true;
        } else {
            return false;
        }
    }

    public void run() {

    }
}
