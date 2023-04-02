package TTT;

public class Bord {
    int size;
    char[][] bord;

    Bord(int size){
        this.size=size;
        this.bord=new char[this.size][this.size];
        for(int i=0;i<this.size;i++){
            for(int j=0;j<this.size;j++){
                bord[i][j]='-';
            }
        }
    }
     @Override
    public String toString(){
        StringBuilder sb=new StringBuilder();
        for(char[] oned:this.bord){
            for(char c:oned) sb.append(c).append("\t");
            sb.append("\n");
        }
        return sb.toString();
    }
}
