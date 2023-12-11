
module com.pi4led {
    requires com.pi4j;
    requires com.pi4j.plugin.pigpio;

    requires org.slf4j;
    requires org.slf4j.simple;

    uses com.pi4j.extension.Extension;
    uses com.pi4j.provider.Provider;

    opens com.pi4led to com.pi4j;
}
