package ����ģʽ;
/**
 * ��������:

1. ׿����ϲ������, ����, ����������ʶ׿����, ��ô���������ͻ�, ���ɿ���,��������

2. ׿����Ҳ���Բ���ô��, ��ϲ������, ��һ����, ������˰��ʻ�, �ɿ������������͸�����. 

�������ַ�ʽ, ���ﵽ��Ŀ����һ���ġ��������������������������ʵ��:

��һ��: ׿����ϲ������, ��ô���������ͻ�, ���ɿ���,��������
 * @author Administrator
 *
 */
/*
 * ׷����
 */
public class Pursuit  extends SendGift{
	//׷��Ķ���
    private SchoolGril sg;
    
    public Pursuit(SchoolGril sg){
        this.sg = sg;
    }
    
    // ��Ϊ: ����׷�����ͻ�,���ɿ���, ��������
    public void sendFllower(){
        System.out.println(sg.getName() + " �����ʻ�");
    }
    
    public void sendDolls(){
        System.out.println(sg.getName() + " ����������");
    }
    
    public void sendChocolate(){
        System.out.println(sg.getName() + " �����ɿ���");
    }

	@Override
	public void sendFlower() {
		// TODO Auto-generated method stub
		
	}
}












