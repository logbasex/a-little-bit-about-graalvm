- https://medium.com/graalvm/3-ways-to-polyglot-with-graalvm-fb28c1542b45
- https://stackoverflow.com/questions/52156119/how-to-get-graal-sdk-packages-to-work-without-maven
- https://medium.com/graalvm/multi-threaded-java-javascript-language-interoperability-in-graalvm-2f19c1f9c37b

## Gu (GraalVM Updater)
- https://www.graalvm.org/jdk17/reference-manual/graalvm-updater/#install-components
- https://www.infoq.com/news/2023/10/graalvm-language-libraries/
- gu was last supported in GraalVM on JDK 20. It was used to install packages, most notably Native Image and JavaScript, for example, gu install native-image and gu install js, respectively. From GraalVM on JDK 21 moving forward, the gu utility has been removed and similar functionality is provided by several Java libraries.

## Embed Languages
- https://www.graalvm.org/latest/reference-manual/embed-languages/

## Simple Language
- https://github.com/graalvm/graalvm-ten-things/blob/master/README.md
- https://maarten.mulders.it/2019/10/building-a-programming-language-on-graalvm-part-1/

## Install numpy

If you're encountering a "No module named pip" error when trying to install NumPy using GraalPython, it indicates that `pip` is not installed or not recognized in your GraalPython environment. Here's how you can resolve this and install NumPy:

1. **Install Pip for GraalPython**: You need to ensure that `pip` is installed for the GraalPython interpreter. Typically, `pip` can be installed using the ensurepip module, which comes bundled with Python. Run the following command:
   ```bash
   /home/logbasex/Downloads/graalvm-jdk-17_linux-x64_bin/graalvm-jdk-17.0.7+8.1/bin/graalpy -m ensurepip
   ```

2. **Upgrade Pip (Optional)**: It's a good practice to ensure you have the latest version of `pip`. You can upgrade `pip` using the following command:
   ```bash
   /home/logbasex/Downloads/graalvm-jdk-17_linux-x64_bin/graalvm-jdk-17.0.7+8.1/bin/graalpy -m pip install --upgrade pip
   ```

3. **Install NumPy**: Once `pip` is installed and upgraded, you can install NumPy using the same `pip` command. Run:
   ```bash
   /home/logbasex/Downloads/graalvm-jdk-17_linux-x64_bin/graalvm-jdk-17.0.7+8.1/bin/graalpy -m pip install numpy
   ```

4. **Verify the Installation**: After the installation, verify it by running a Python script that imports NumPy and uses some of its functionality.

If `ensurepip` does not work or if you still encounter issues, it may be necessary to consult the GraalVM documentation or community forums for specific guidance, as the exact steps can vary depending on the version of GraalVM and its configuration.