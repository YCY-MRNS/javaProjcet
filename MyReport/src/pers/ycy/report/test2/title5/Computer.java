package pers.ycy.report.test2.title5;

public class Computer {
	private USB[] usbArr = new USB[4];

	// ������������һ��USB�豸
	public void add(USB usb) {
		// �������еĲ��
		for (int i = 0; i < usbArr.length; i++) {
			// �������һ���յ�
			if (usbArr[i] == null) {
				usbArr[i] = usb;
				break;
			}
		}
	}

	// ����Ŀ�������
	public void powerOn() {
		// �������еĲ��
		for (int i = 0; i < usbArr.length; i++) {
			// ����������豸
			if (usbArr[i] != null) {
				// ��USB�豸����
				usbArr[i].turnOn();
			}
		}
		System.out.println("����������ɹ�������");
	}

	// ����Ĺػ�����
	public void powerOff() {
		// �������еĲ��
		for (int i = 0; i < usbArr.length; i++) {
			// ����������豸
			if (usbArr[i] != null) {
				// ��USB�豸�ر�
				usbArr[i].turnOff();
			}
		}
		System.out.println("������ػ��ɹ�������");
	}

}
