package bean;
// Generated 28/08/2024 10:07:57 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * UsuarioKvm generated by hbm2java
 */
@Entity
@Table(name="usuario_kvm"
    ,catalog="db_kelvin_morel"
)
public class UsuarioKvm  implements java.io.Serializable {


     private int idusuarioKvm;
     private String nomeKvm;
     private String apelidoKvm;
     private String cpfKvm;
     private String emailKvm;
     private String senhaKvm;
     private int nivelKvm;
     private String ativoKvm;

    public UsuarioKvm() {
    }

    public UsuarioKvm(int idusuarioKvm, String nomeKvm, String apelidoKvm, String cpfKvm, String emailKvm, String senhaKvm, int nivelKvm, String ativoKvm) {
       this.idusuarioKvm = idusuarioKvm;
       this.nomeKvm = nomeKvm;
       this.apelidoKvm = apelidoKvm;
       this.cpfKvm = cpfKvm;
       this.emailKvm = emailKvm;
       this.senhaKvm = senhaKvm;
       this.nivelKvm = nivelKvm;
       this.ativoKvm = ativoKvm;
    }
   
     @Id 

    
    @Column(name="idusuario_kvm", unique=true, nullable=false)
    public int getIdusuarioKvm() {
        return this.idusuarioKvm;
    }
    
    public void setIdusuarioKvm(int idusuarioKvm) {
        this.idusuarioKvm = idusuarioKvm;
    }

    
    @Column(name="nome_kvm", nullable=false, length=40)
    public String getNomeKvm() {
        return this.nomeKvm;
    }
    
    public void setNomeKvm(String nomeKvm) {
        this.nomeKvm = nomeKvm;
    }

    
    @Column(name="apelido_kvm", nullable=false, length=30)
    public String getApelidoKvm() {
        return this.apelidoKvm;
    }
    
    public void setApelidoKvm(String apelidoKvm) {
        this.apelidoKvm = apelidoKvm;
    }

    
    @Column(name="cpf_kvm", nullable=false, length=14)
    public String getCpfKvm() {
        return this.cpfKvm;
    }
    
    public void setCpfKvm(String cpfKvm) {
        this.cpfKvm = cpfKvm;
    }

    
    @Column(name="email_kvm", nullable=false, length=50)
    public String getEmailKvm() {
        return this.emailKvm;
    }
    
    public void setEmailKvm(String emailKvm) {
        this.emailKvm = emailKvm;
    }

    
    @Column(name="senha_kvm", nullable=false, length=45)
    public String getSenhaKvm() {
        return this.senhaKvm;
    }
    
    public void setSenhaKvm(String senhaKvm) {
        this.senhaKvm = senhaKvm;
    }

    
    @Column(name="nivel_kvm", nullable=false)
    public int getNivelKvm() {
        return this.nivelKvm;
    }
    
    public void setNivelKvm(int nivelKvm) {
        this.nivelKvm = nivelKvm;
    }

    
    @Column(name="ativo_kvm", nullable=false, length=1)
    public String getAtivoKvm() {
        return this.ativoKvm;
    }
    
    public void setAtivoKvm(String ativoKvm) {
        this.ativoKvm = ativoKvm;
    }




}


