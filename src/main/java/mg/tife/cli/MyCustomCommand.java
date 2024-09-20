package mg.tife.cli;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
public class MyCustomCommand {

	@ShellMethod(key = "hello")
	public String hello(@ShellOption(defaultValue = "toto") String name,@ShellOption(defaultValue = "1") int counter) {
		StringBuilder strBuilder = new StringBuilder();
		for(int i = 1; i<counter+1;i++) {
			strBuilder.append("Hello "+name + " === " + i +"\n");
		}
		return strBuilder.toString();
	}
	
	@ShellMethod(key = "test")
	public String test() {
		return "test SHELL";
	}
}
