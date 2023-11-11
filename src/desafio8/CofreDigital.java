package desafio8;

public class CofreDigital extends Cofre {
        final int senha;
    
        CofreDigital(int senha) {
            super("Cofre Digital", "Senha");
            this.senha = senha;
        }
    
        boolean validarSenha(int confirmacaoSenha) {
            return confirmacaoSenha == senha;
        }
    }

