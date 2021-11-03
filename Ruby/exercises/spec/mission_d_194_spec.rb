require './app/mission_d_194.rb'

describe 'カロリーチェック' do
  describe '出力結果のテスト' do
    let(:missionD194) { MissionD194.new }

    it 'テスト1' do
      allow($stdin).to receive(:gets).and_return "2\n"
      expect($stdout).to receive(:puts).with(1080)
      missionD194.run
    end

    it 'テスト2' do
      allow($stdin).to receive(:gets).and_return "5\n"
      expect($stdout).to receive(:puts).with(2700)
      missionD194.run
    end
  end
end
