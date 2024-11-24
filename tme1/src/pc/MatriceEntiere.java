package pc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MatriceEntiere {
	private int[][] mat;

	public MatriceEntiere(int nbLigne, int nbCol) {
		mat = new int[nbLigne][nbCol];
		for (int i = 0; i < nbLigne; i++) {
			for (int j = 0; j < nbCol; j++) {
				mat[i][j] = 0;
			}
		}

	}

	public int getElem(int lig, int col) {
		return mat[lig][col];
	}

	public void setElem(int lig, int col, int val) {
		mat[lig][col] = val;
	}

	public int nbLignes() {
		return mat.length;
	}

	public int nbColonnes() {
		return mat[0].length;
	}

	public static MatriceEntiere parseMatrix(File fichier) throws IOException {
		try (BufferedReader in = new BufferedReader(new FileReader(fichier))) {
			int nbLig = Integer.parseInt(in.readLine());
			int nbCol = Integer.parseInt(in.readLine());
			MatriceEntiere m = new MatriceEntiere(nbLig, nbCol);
			for (int i = 0; i < nbLig; i++) {
				String[] line = in.readLine().split(" ");
				for (int j = 0; j < nbCol; j++) {
					m.setElem(nbLig, nbCol, Integer.parseInt(line[j]));
				}
			}
			return m;
		} catch (Exception e) {
			throw new IOException(e);
		}

	}

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append(nbLignes() + "\n");
		s.append(nbColonnes() + "\n");

		for (int i = 0; i < nbLignes(); i++) {
			for (int j = 0; j < nbColonnes(); j++) {
				s.append(getElem(i, j) + " ");
			}
			s.append("\n");
		}
		return s.toString();
	}

	public boolean equals(Object o) {
		if (o == this) {
			return true;
		}
		if (o instanceof MatriceEntiere m) {
			for (int i = 0; i < nbLignes(); i++) {
				for (int j = 0; j < nbColonnes(); j++) {
					if (getElem(i, j) != m.getElem(i, j))
						return false;
				}
			}
			return true;
		}
		return false;
	}

	public MatriceEntiere ajoute(MatriceEntiere m) throws TaillesNonConcordantesException {
		try {
			MatriceEntiere res = new MatriceEntiere(nbLignes(), nbColonnes());
			for (int i = 0; i < nbLignes(); i++) {
				for (int j = 0; j < nbColonnes(); j++) {
					res.setElem(i, j, m.getElem(i, j) + getElem(i, j));
				}
			}
			return res;

		} catch (Exception e) {
			throw new TaillesNonConcordantesException("Taille non concordantes");
		}
	}
	
	
	public MatriceEntiere produit(MatriceEntiere m)throws TaillesNonConcordantesException{
		MatriceEntiere res= new MatriceEntiere(nbLignes(), nbColonnes());
		for (int i=0; i<nbLignes(); i++) {
			for(int j=0; j<nbColonnes(); j++) {
				//for(int k=0; k<nb)
			}
		}
		return null;
	}

}
