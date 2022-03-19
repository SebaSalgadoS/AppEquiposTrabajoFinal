package interfaces;

import android.content.Context;

public interface RegistroInteractor {
    void registrar(String nombre, String user, String pass, RegistroPresenter presenter, Context contexto);
}
