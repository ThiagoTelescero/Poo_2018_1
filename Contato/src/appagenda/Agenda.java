package appagenda;

import java.util.ArrayList;

public class Agenda {
	private ArrayList<ContatoBasico>contatos;
    Agenda()
    {   contatos=new ArrayList();
    }
    public void inserir(ContatoBasico c)
    {   contatos.add(c);
    }
    public ContatoBasico ContatoBasicobuscar(String nome)
    {   for(int i=0;i<contatos.size();i++)
        {   ContatoBasico c=contatos.get(i);
             if(c.getNome().equalsIgnoreCase(nome))
               return contatos.get(i);
        }
        return null;
    }
    public ContatoBasicobuscar(intpos)
    {   if(pos>=0 &&pos<contatos.size())
        {   returncontatos.get(pos);
        }
        return null;
    }
    public Econtato EContatobuscarEmail(String email)
    {   for(int i=0;i<contatos.size();i++)
        {   if(contatos.get(i) instanceofEContato)
            {
              EContato c=(Econtato)contatos.get(i);
              if(c.getEmail().equalsIgnoreCase(email))
              return (Econtato)contatos.get(i);
            }
        }
        return null;
    }
    public Contato[] buscarGeral(String palavraChave)
    {   ArrayList<ContatoBasico>todos=new ArrayList();
         for(int i=0;i<contatos.size();i++)
          {   ContatoBasico c=contatos.get(i);
               if(c.getDados().contains(palavraChave))
                 todos.add(c);
           }
           Contato[] vet=new Contato[todos.size()];
 
            return (todos.toArray(vet));
     }
     public Contato[] buscarTodos()
    {   Contato[] vet=new Contato[contatos.size()];
 
         return (contatos.toArray(vet));
    }
    public Object Agenda1()
   {  return Contato.size();
    }    
}
