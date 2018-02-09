package crackingthecode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class duplicateFiles {
	
	public static class Entity {
		Boolean isFolder;
		ArrayList<Entity> children;
		String name;
		String content;
		
		public Entity(String name, Boolean isFolder) {
			this.isFolder = isFolder;
			this.children = new ArrayList<Entity>();
			this.name = name;
		}
		 public ArrayList<Entity> getChildren() {
			 return this.children;
		 }
		 
		 public void addChild(Entity et) {
			 children.add(et);			 
		 }
		 
		 public void setContent(String content) {
			 this.content = content;
		 }
		 
		 public String getName() {
			 return this.name;
		 }
		 
		 public String getContent() {
			 return this.content;
		 }
		 
		 public void print() {
			 System.out.println("Name:" + name);
		 } 
		 
	}
	
	public static void findDuplicates(Entity a, HashMap<String, ArrayList<String>> map){
		a.print();
		if(a.isFolder) {
			ArrayList<Entity> children = a.getChildren();
			for(Entity c : children) {
				findDuplicates(c, map);
			}
		} else {
			String cont = a.getContent();
			String name = a.getName();

			if(!map.containsKey(cont)) {
				ArrayList<String> fileList = new ArrayList<>();
				fileList.add(name);
				map.put(cont, fileList);
			} else {
				ArrayList<String> fileList = map.get(cont);
				fileList.add(name);
				map.replace(cont, fileList);
			}
		}
	} 
	
	public static void main(String[] args) {
		Entity a = new Entity("a", true);
		Entity b = new Entity("b", true);
		Entity c = new Entity("c", false);
		Entity d = new Entity("d", false);
		Entity e = new Entity("e", false);
		
		a.addChild(b);
		a.addChild(c);
		b.addChild(e);
		b.addChild(d);
		
		d.setContent("abcd");
		e.setContent("efgh");
		c.setContent("abcd");
		
		HashMap<String, ArrayList<String>> map = new HashMap<>();
		findDuplicates(a, map);
		for(ArrayList<String> arr : map.values()) {
			if(arr.size() > 1) {
				System.out.println(arr);
			}
		}
	}
}
