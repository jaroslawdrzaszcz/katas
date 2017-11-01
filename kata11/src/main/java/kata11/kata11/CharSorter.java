package kata11.kata11;

public class CharSorter {

	public String sort(String string) {
		
			char[] chars = string.replaceAll("[^a-zA-Z]", "").toLowerCase().toCharArray();
			
			CharSorterMachine.sort(chars);

			return String.valueOf(chars);
		}

	}
	

