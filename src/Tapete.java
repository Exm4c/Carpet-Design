public class Tapete extends Forma{
    float  precoTapete = 0;
    Material material;
    Tapete () {}
    
    Tapete (float  m2, String nome, Material material) {
        this.m2 = m2 ;
        this.nome = nome;
        this.material = material;
        this.precoTapete = this.material.valor * this.m2;
    }
    public void criaTapete(float dimensao1,float  dimensao2, float  m2, String nome, Material material){
        this.dimensao1 = dimensao1;
        this.dimensao2 = dimensao2;
        this.m2 = m2 ;
        this.nome = nome;
        this.material = material;
        this.precoTapete = this.material.valor * this.m2;
    }
        
    public boolean equalsTapete(Tapete t){
        return this.m2 == t.m2 && this.material == t.material && this.nome.equals(t.nome);
    }
    
    
}
