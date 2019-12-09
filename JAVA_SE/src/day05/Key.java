package day05;

/**
 * ��һ�����ʵ����ΪHashMap��keyʱ,����equals������hashcode���� ����дֱ��Ӱ����ɢ�б�(HashMap)�Ĳ�ѯ����
 * ��API�ĵ���Object����������������д������˵�� :��������дһ�����equals����ʱӦ����ͬ��дhashcode���� ������������дӦ����ѭ:
 * 1:һ����,����������equals�Ƚ�Ϊtrueʱ,hashcode�������ص����ֱ������,
 * ��������Ȼ���Ǳ����,��ҲӦ����ѭ,������hashcode�л��γ�����Ӱ�쵽��ѯ���� ������������hashcode��ͬʱ,equalsҲӦ��Ϊtrue
 * 2:�ȶ���:hashcode������ε��ú󷵻ص�����Ӧ����ͬ,��Ӧ��һ���仯��ֵ ���ǲ���equals�Ƚϵ�����ֵ�����˸ı�.
 * 
 * ������!!!!
 * 
 * @author L
 *
 */
public class Key {
	private int x;
	private int y;

	public Key() {
		super();

	}

	public Key(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
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
		Key other = (Key) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

}
