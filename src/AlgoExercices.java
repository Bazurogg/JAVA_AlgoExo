import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AlgoExercices extends JFrame {

    private JTextArea displayArea;

    public AlgoExercices() {

        // Configurer la fenêtre principale
        setTitle("Exercices d'Algorithmes corrigés");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Initialiser la zone de texte
        displayArea = new JTextArea();
        displayArea.setEditable(false);
        displayArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
        add(new JScrollPane(displayArea), BorderLayout.CENTER);

        // Ajouter le menu
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu exerciceMenu = new JMenu("Exercices pseudoCode");
        menuBar.add(exerciceMenu);

        // Ajout nouvel onglet exo JAVA
        JMenu calculMenu = new JMenu("Exercices JAVA");
        menuBar.add(calculMenu);

        // Ajouter les éléments de menu pour chaque exercice
        JMenuItem exercice21 = new JMenuItem("Exercice 2.1: Calcul du prix TTC");
        exerciceMenu.add(exercice21);
        exercice21.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                afficherExercice21();
            }
        });

        JMenuItem exercice22 = new JMenuItem("Exercice 2.2: Ecrire un Programme pour dire bonjour.");
        exerciceMenu.add(exercice22);
        exercice22.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                afficherExercice22();
            }
        });

        JMenuItem exercice23 = new JMenuItem("Exercice 2.3: Calcul du produit de 2 nombres.");
        exerciceMenu.add(exercice23);
        exercice23.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                afficherExercice23();
            }
        });

        JMenuItem exercice32 = new JMenuItem("Exercice 3.2: Calcul de la factorielle d'un nombre donné.");
        exerciceMenu.add(exercice32);
        exercice32.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                afficherExercice32();
            }
        });

        JMenuItem exercice41 = new JMenuItem("Exercice 4.1: Calcul de la moyenne d'un ensemble de note.");
        exerciceMenu.add(exercice41);
        exercice41.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                afficherExercice41();
            }
        });

        // Ajouter les éléments de menu pour les exercices Java
        JMenuItem javaExercice21 = new JMenuItem("Exercice 2.1: Calcul du prix TTC");
        calculMenu.add(javaExercice21);
        javaExercice21.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                executerExercice21Java();
            }
        });

        JMenuItem javaExercice22 = new JMenuItem("Exercice 2.2: Ecrire un Programme pour dire bonjour.");
        calculMenu.add(javaExercice22);
        javaExercice22.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                executerExercice22Java();
            }
        });

        JMenuItem javaExercice23 = new JMenuItem("Exercice 2.3: Calcul du produit de 2 nombres.");
        calculMenu.add(javaExercice23);
        javaExercice23.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                executerExercice23Java();
            }
        });

        JMenuItem javaExercice32 = new JMenuItem("Exercice 3.2: Calcul de la factorielle d'un nombre donné.");
        calculMenu.add(javaExercice32);
        javaExercice32.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                executerExercice32Java();
            }
        });

        JMenuItem javaExercice41 = new JMenuItem("Exercice 4.1: Calcul de la moyenne d'un ensemble de note.");
        calculMenu.add(javaExercice41);
        javaExercice41.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                executerExercice41Java();
            }
        });
    }

    // Méthode pour afficher l'Exercice 2.1
    private void afficherExercice21() {
        String pseudoCode = "Début\n" +
                "\nVariable prixHT, prixTTC : float\n" +
                "\nAfficher \"Ecrire prix Hors taxe produit.\"\n" +
                "\nLire prixHT\n" +
                "\nprixTTC <- prixHT * 1.196\n" +
                "\nAfficher \"Le prix TTC du produit est \", prixTTC\n" +
                "\nFin";
        displayArea.setText(pseudoCode);
    }

    // Méthode pour afficher l'Exercice 2.2
    private void afficherExercice22() {
        String pseudoCode = "Début\n" +
                "\n// Afficher \"Ecrire nom\"\n" +
                "\n" +
                "Lire nom\n" +
                "\n" +
                "Afficher \"Ecrire prénom\"\n" +
                "\n" +
                "Lire prénom\n" +
                "\n" +
                "Afficher \"Bonjour \" prénom \" \" nom.\n" +
                "\nFin";
        displayArea.setText(pseudoCode);
    }

    private void afficherExercice23() {
        String pseudoCode = "Début\n" +
                "\n// Variable nb1, nb2, produit : integer\n" +
                "\n" +
                "Afficher \"Entrez nombre 1\"\n" +
                "\n" +
                "Lire nb1\n" +
                "\n" +
                "Afficher \"Entrez nombre 2\"\n" +
                "\n" +
                "Lire nb2\n" +
                "\n" +
                "\n" +
                "produit <- nb1 * nb2\n" +
                "\n" +
                "\n" +
                "si produit < 0 \n" +
                " \n" +
                "    Afficher \"Le produit \" produit \"est négatif\n" +
                "\n" +
                "sinon si  le produit = 0 \n" +
                "\n" +
                "    Afficher \"Le produit \" produit \"est nul\"\n" +
                "\n" +
                "sinon \n" +
                "\n" +
                "    Afficher \"Le produit \" produit \"est positif\"\n" +
                "\n" +
                "fin si\n" +
                "\nFin";
        displayArea.setText(pseudoCode);
    }

    private void afficherExercice32() {
        String pseudoCode = "Début\n" +
                "\n//     Variable n, i, f : entier\n" +
                "\n" +
                "    f <- 1\n" +
                "\n" +
                "    Afficher \"Entrez un nombre entier positif :\"\n" +
                "\n" +
                "    Lire n\n" +
                "\n" +
                "    Si n < 0 Alors\n" +
                "\n" +
                "        Afficher \"Le nombre doit être positif.\"\n" +
                "\n" +
                "    Sinon\n" +
                "        \n" +
                "        Pour i <- 1 à n Faire\n" +
                "\n" +
                "            f <- f * i\n" +
                "            \n" +
                "        Fin Pour\n" +
                "\n" +
                "        Afficher \"La factorielle de \", n, \" est : \", f\n" +
                "\n" +
                "    Fin Si\n" +
                "\nFin";
        displayArea.setText(pseudoCode);
    }

    private void afficherExercice41() {
        String pseudoCode = "Début\n" +
                "\n// FONCTIONS_UTILISEES\n" +
                "VARIABLES\n" +
                "\n" +
                "i EST_DU_TYPE NOMBRE\n" +
                "\n" +
                "somme EST_DU_TYPE NOMBRE\n" +
                "\n" +
                "note EST_DU_TYPE NOMBRE\n" +
                "\n" +
                "moy EST_DU_TYPE NOMBRE\n" +
                "\n" +
                "DEBUT_ALGORITHME\n" +
                "\n" +
                "    somme PREND_LA_VALEUR 0\n" +
                "\n" +
                "    POUR i ALLANT_DE 1 A 9\n" +
                "\n" +
                "        DEBUT_POUR\n" +
                "            AFFICHER \"Entrez la note \"\n" +
                "            AFFICHER i\n" +
                "            LIRE note\n" +
                "            somme PREND_LA_VALEUR somme + note\n" +
                "        FIN_POUR\n" +
                "\n" +
                "    moy PREND_LA_VALEUR somme / 9\n" +
                "\n" +
                "    AFFICHER moy\n" +
                "\n" +
                "FIN_ALGORITHME\n" +
                "\nFin";
        displayArea.setText(pseudoCode);
    }



    // --------------------------------------- PARTIE EXE EN JAVA -------------------------------------------------- //

    

    // Méthode pour exécuter l'Exercice 2.1 en Java
    private void executerExercice21Java() {
        String prixHTStr = JOptionPane.showInputDialog(this, "Entrez le prix HT :");
        if (prixHTStr != null && !prixHTStr.isEmpty()) {
            try {
                double prixHT = Double.parseDouble(prixHTStr);
                double prixTTC = prixHT * 1.196;
                JOptionPane.showMessageDialog(this, "Le prix TTC du produit est : " + prixTTC);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Veuillez entrer un nombre valide.", "Erreur", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    // Méthode pour exécuter l'Exercice 2.2 en Java
    private void executerExercice22Java() {
        String nom = JOptionPane.showInputDialog(this, "Entrez votre nom :");
        String prenom = JOptionPane.showInputDialog(this, "Entrez votre prénom :");
        if (nom != null && !nom.isEmpty() && prenom != null && !prenom.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Bonjour " + prenom + " " + nom + ".");
        }
    }

    // Méthode pour exécuter l'Exercice 2.3 en Java
    private void executerExercice23Java() {
        String nb1Str = JOptionPane.showInputDialog(this, "Entrez le premier nombre :");
        String nb2Str = JOptionPane.showInputDialog(this, "Entrez le deuxième nombre :");
        if (nb1Str != null && !nb1Str.isEmpty() && nb2Str != null && !nb2Str.isEmpty()) {
            try {
                int nb1 = Integer.parseInt(nb1Str);
                int nb2 = Integer.parseInt(nb2Str);
                int produit = nb1 * nb2;
                String message;
                if (produit < 0) {
                    message = "Le produit " + produit + " est négatif.";
                } else if (produit == 0) {
                    message = "Le produit " + produit + " est nul.";
                } else {
                    message = "Le produit " + produit + " est positif.";
                }
                JOptionPane.showMessageDialog(this, message);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Veuillez entrer des nombres valides.", "Erreur", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    // Méthode pour exécuter l'Exercice 3.2 en Java
    private void executerExercice32Java() {
        String nStr = JOptionPane.showInputDialog(this, "Entrez un nombre entier positif :");
        if (nStr != null && !nStr.isEmpty()) {
            try {
                int n = Integer.parseInt(nStr);
                if (n < 0) {
                    JOptionPane.showMessageDialog(this, "Le nombre doit être positif.", "Erreur", JOptionPane.ERROR_MESSAGE);
                } else {
                    int f = 1;
                    for (int i = 1; i <= n; i++) {
                        f *= i;
                    }
                    JOptionPane.showMessageDialog(this, "La factorielle de " + n + " est : " + f);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Veuillez entrer un nombre valide.", "Erreur", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    // Méthode pour exécuter l'Exercice 4.1 en Java
    private void executerExercice41Java() {
        double somme = 0;
        for (int i = 1; i <= 9; i++) {
            String noteStr = JOptionPane.showInputDialog(this, "Entrez la note " + i + " :");
            if (noteStr != null && !noteStr.isEmpty()) {
                try {
                    double note = Double.parseDouble(noteStr);
                    somme += note;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "Veuillez entrer un nombre valide.", "Erreur", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            } else {
                return;
            }
        }
        double moy = somme / 9;
        JOptionPane.showMessageDialog(this, "La moyenne des notes est : " + moy);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AlgoExercices().setVisible(true);
            }
        });
    }
}

