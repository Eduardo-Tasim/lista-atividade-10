package br.com.techcorp.model;

public class funcionario {
    
    private string matricula;
    private string nome;
    private string cargo;

    public string getMatricula() {
        return matricula;
    }
    
    public void setMatricula(string matricula) {
        this.matricula = matricula;
    }

    public string getNome() {
        return nome;
    }

    public void setNome(string nome) {
        this.nome = nome;
    }

    public string getCargo() {
        return cargo;
    }

    public void setCargo(string cargo) {
        this.cargo = cargo;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        funcionario other = (funcionario) obj;
        if (matricula == null) {
            if (other.matricula != null)
                return false;
        } else if (!matricula.equals(other.matricula))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "funcionario [matricula=" + matricula + ", nome=" + nome + ", cargo=" + cargo + "]";
    }
    
}
