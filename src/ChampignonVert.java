public class ChampignonVert {
    static int nbChampignonVert;
    String couleur;
    boolean estAttrape;

    ChampignonVert(){
        this.couleur="Vert";
        this.estAttrape=false;
        if(ChampignonVert.nbChampignonVert < 1) {
            ChampignonVert.nbChampignonVert ++;
        } else {
            System.out.println("Il y a trop de champignons verts sur ce niveau");
        }

    }
}
