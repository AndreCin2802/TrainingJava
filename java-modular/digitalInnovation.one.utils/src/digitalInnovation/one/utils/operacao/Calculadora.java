package digitalInnovation.one.utils.operacao;

import digitalInnovation.one.utils.operacao.internal.DivHelper;
import digitalInnovation.one.utils.operacao.internal.MultHelper;
import digitalInnovation.one.utils.operacao.internal.SubHelper;
import digitalInnovation.one.utils.operacao.internal.SumHelper;

public class Calculadora {

    private DivHelper divHelper;
    private MultHelper multHelper;
    private SubHelper subHelper;
    private SumHelper sumHelper;

    public Calculadora() {
            divHelper = new DivHelper();
            multHelper = new MultHelper();
            subHelper = new SubHelper();
            sumHelper = new SumHelper();
        }

    public int sum(int a , int b) {
        return sumHelper.execute(a,b);
    }

    public  int sub(int a , int b ) {
        return subHelper.execute(a,b);
    }

    public int multi(int a, int b) {
        return multHelper.execute(a,b);
    }

    public  int div(int a, int b) {
        return divHelper.execute(a,b);
    }
}
