package com.airbnb.plog.stats;

public interface StatisticsReporter {
    long receivedUdpSimpleMessage();

    long receivedUdpInvalidVersion();

    long receivedV0InvalidType();

    long receivedV0Command();

    long receivedUnknownCommand();

    long receivedV0MultipartMessage();

    long receivedV0MultipartFragment(int index);

    long receivedV0InvalidChecksum(int index);

    long receivedV0InvalidMultipartFragment(final int fragmentIndex, final int expectedFragments);

    long missingFragmentInDroppedMessage(final int fragmentIndex, final int expectedFragments);

    long failedToSend();

    long exception();

    long foundHolesFromDeadPort(int holesFound);

    long foundHolesFromNewMessage(int holesFound);
}