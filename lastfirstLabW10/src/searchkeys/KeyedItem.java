package searchkeys;

public class KeyedItem<KT> {
	
	private KT key; // do not change from private

	public KeyedItem(KT key) {
		this.key = key;
	}

	public KT getKey() {
		return this.key;
	}	

}
