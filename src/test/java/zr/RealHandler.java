package zr;

public class RealHandler extends Handler{

	@Override
	public void handlerRequest() {
		if(getHandler() != null) {
			System.out.println("�Ź�����");
			getHandler().handlerRequest();
		}else {
			System.out.println("��������");
		}
	}

}
