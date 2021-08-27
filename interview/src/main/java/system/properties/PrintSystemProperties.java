package system.properties;

public class PrintSystemProperties {

	public static void main(String[] args) {

		// file.separator
		String fileSeparatorKey = "file.separator";
		String fileSeparatorKeyValue = System.getProperty(fileSeparatorKey);
		System.out.println(fileSeparatorKey + " - " + fileSeparatorKeyValue);

		// java.class.path
		String javaClassPathKey = "java.class.path";
		String javaClassPathKeyValue = System.getProperty(javaClassPathKey);
		System.out.println(javaClassPathKey + " - " + javaClassPathKeyValue);

		// pathSeparator
		String pathSeparatorKey = "path.separator";
		String pathSeparatorKeyValue = System.getProperty(pathSeparatorKey);
		System.out.println(pathSeparatorKey + " - " + pathSeparatorKeyValue);

		// javaHome
		String javaHomeKey = "java.home";
		String javaHomeKeyValue = System.getProperty(javaHomeKey);
		System.out.println(javaHomeKey + " - " + javaHomeKeyValue);

		// javaVendor
		String javaVendorKey = "java.vendor";
		String javaVendorKeyValue = System.getProperty(javaVendorKey);
		System.out.println(javaVendorKey + " - " + javaVendorKeyValue);

		// javaVendorUrl
		String javaVendorUrlKey = "java.vendor.url";
		String javaVendorUrlKeyValue = System.getProperty(javaVendorUrlKey);
		System.out.println(javaVendorUrlKey + " - " + javaVendorUrlKeyValue);

		// javaVersion
		String javaVersionKey = "java.version";
		String javaVersionKeyValue = System.getProperty(javaVersionKey);
		System.out.println(javaVersionKey + " - " + javaVersionKeyValue);

		// lineSeparator
		String lineSeparatorKey = "line.separator";
		String lineSeparatorKeyValue = System.getProperty(lineSeparatorKey);
		System.out.println(lineSeparatorKey + " - " + lineSeparatorKeyValue);

		// os.arch
		String osArchKey = "os.arch";
		String osArchKeyValue = System.getProperty(osArchKey);
		System.out.println(osArchKey + " - " + osArchKeyValue);

		// osName
		String osNameKey = "os.name";
		String osNameKeyValue = System.getProperty(osNameKey);
		System.out.println(osNameKey + " - " + osNameKeyValue);

		// osVersion
		String osVersionKey = "os.version";
		String osVersionKeyValue = System.getProperty(osVersionKey);
		System.out.println(osVersionKey + " - " + osVersionKeyValue);

		// userDir
		String userDirKey = "user.dir";
		String userDirKeyValue = System.getProperty(userDirKey);
		System.out.println(userDirKey + " - " + userDirKeyValue);

		// userHome
		String userHomeKey = "user.home";
		String userHomeKeyValue = System.getProperty(userHomeKey);
		System.out.println(userHomeKey + " - " + userHomeKeyValue);

		// userName
		String userNameKey = "user.name";
		String userNameKeyValue = System.getProperty(userNameKey);
		System.out.println(userNameKey + " - " + userNameKeyValue);
	}

}
